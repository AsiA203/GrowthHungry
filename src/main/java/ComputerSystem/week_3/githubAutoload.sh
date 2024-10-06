#!/usr/bin/env bash

directory=("/Users/aseliaazimkanova/Desktop/GrowthHungryFiles/GrowthHungry/src/main/java/ComputerSystem"/*)
file_name=()

for i in "${files[@]}"; do
	if [ -f "$file" ]; then
		file_names+=("$(basename "$file")")
	fi
done