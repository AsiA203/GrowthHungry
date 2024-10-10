#!/usr/bin/env bash

directory=("/Users/aseliaazimkanova/Desktop/GrowthHungryFiles/GrowthHungry/src/main/java/ComputerSystem"/*)
#Initializing history of file names and count, it will get reinitialized at the end 
previusFileNames=("week_1" "week_2" "week_3")
previusFileCount=3

currentFileNames=()
currentFileCount=0

newAddedFileNames=()
newAddedFileCount=()

push () {
    path="/Users/aseliaazimkanova/Desktop/GrowthHungryFiles/GrowthHungry/src/main/java/ComputerSystem"
    find "$path" -type d -empty -exec touch {}/.gitkeep \;
	git add "$path"
	git commit -m "New changes added to Computer System Folder"
	git push origin main
}

currentFilesCheck(){
    for array1 in "${currentFileNames[@]}"; do
          found=false
        for array2 in "${previusFileNames[@]}"; do
        if [ "$array1" == "$array2" ]; then
          found=true
        break  # Exit the inner loop if a match is found
        fi
    done
    # If no match was found, print the item from array1
        if [ "$found" == false ]; then
            newAddedFileNames+=("$array1")
            newAddedFileCount+=1
            echo "new file found"
        fi
    done

echo "Fun2"
echo "status names: ${newAddedFileNames[@]} "
echo "status count: ${newAddedFileCount[@]}"

#git commit and push
if [[ "$newAddedFileCount" -gt 0  ]]; then
    push
    newAddedFileNames=()
    newAddedFileCount=0
fi 
}

cd /Users/aseliaazimkanova/Desktop/GrowthHungryFiles/GrowthHungry/src/main/java/ComputerSystem
currentFileNames=($(ls -1))
currentFileCount=($(ls -1 | wc -l))

echo "${previusFileNames[@]}"
echo "${previusFileCount[@]}"
echo "${currentFileNames[@]}"
echo "${currentFileCount[@]}"
currentFilesCheck 
echo "${newAddedFileNames[@]}"