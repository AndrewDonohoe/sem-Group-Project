This feature allows an employee to generate a report that displays all capital cities within a chosen area (continent, country, or region).
The system will retrieve this data from the database, sort the cities by population size (descending), and display the results in a readable format.
This feature will help employees analyse and compare capital city populations efficiently for research or planning purposes.

**Scope:**
This use case applies to the data reporting and analysis module of the project. It focuses on retrieving, sorting, and presenting capital city data that has already been entered into the system’s database.

**Level:**
This is a user goal level use case — it represents a complete task that delivers clear value to the end user (the employee).

**Preconditions:**
The system must already have a populated database containing information about cities, including fields for name, population, region/continent, and capital status.
The employee must be logged in or have appropriate access permissions.
The area or region to be reported on must be defined or selectable in the interface.

**Failed Condition:**
If the area entered is invalid or no capital cities exist in that area, the system displays an error or message: “No capital cities found in this area.”
If the database connection fails, the system notifies the user that the report could not be generated.

**Main Success Scenario:**
The employee opens the reporting section of the system.
The employee selects or types in the desired area.
The system validates the input area.
The system queries the database for all capital cities in that area.
The system sorts the retrieved cities by population, from largest to smallest.
The sorted list of capital cities is displayed in a clear, readable table format.
The employee reviews the report and, if needed, exports or saves it.

**Extensions:**
Invalid area input → The system displays an error: “Invalid area entered.”
No data found → The system displays: “No capital cities found in this area.”
Database connection fails → The system shows an error message and logs the issue.

**Sub-Variations:**
The employee may choose to sort the data differently (e.g., ascending population).
The report could be displayed in different formats.
The employee might choose to filter further (e.g., only capitals above a certain population).

**Schedule:**
Due date: code review 4 (full release).