#!/usr/bin/env bash

directory=("/Users/aseliaazimkanova/Desktop/GrowthHungryFiles/GrowthHungry/src/main/java/ComputerSystem"/*)
#Initializing history of file names and count, it will get reinitialized at the end 
previusFileNames=("week_1" "week_2" "week_3")
previusFileCount=3

currentFileNames=()
currentFileCount=0

newAddedFileNames=()
newAddedFileCount=()

contains() {
    local element="$1"
    shift
    for item in "$@"; do
        if [[ "$item" == "$element" ]]; then
            return 0
        fi
    done
    return 1
}

push () {
	cd /Users/aseliaazimkanova/Desktop/GrowthHungryFiles/GrowthHungry/src/main/java/ComputerSystem
	git add .
	git commit -m "New file/files was added to Computer System Folder"
	git push
}

currentFilesCheck(){

    for item in "${currentFileNames[@]}"; do
        if [[ ! " ${previusFileNames[*]} " =~ " $item " ]]; then
            newAddedFileNames+=("$item")
            newAddedFileCount=$((newAddedFileCount + 1))
        fi
    done

    echo "Fun2"
    echo " status ${newAddedFileCount[@]}"

    if [[ "${newAddedFileCount[@]}" > "0" ]]; then
    	push
    	newAddedFileNames=()
    	newAddedFileCount=0
    	"I should push"
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

