# Space Dragon Readme

## Assumptions
1. Each rocket and mission is unique by its `Name`.
2. Rocket deployment changes the status of mission to `In progress`
3. Rocket in rapair changes mission status do `Pending` even if other rocket is in space.


## Other info
- Data stored in Database interface.

## Things for further investigation
- Prevent changing mission state to in progress even if there is one rocket in rapair.
- Make State and Status names more user friendly
- Sort report using stream.