This feature allows an employee to generate a report that displays the top N most populated capital cities within a chosen area (continent, country, or region). The employee specifies a number N, and the system retrieves that many cities from the database, based on the largest populations within the selected area.
The cities are sorted in descending order by population, and the top N results are displayed in a clear, readable report format.
This feature enables employees to analyse and compare the most significant capital cities efficiently for decision-making, planning, or research purposes.

**Scope:**
This use case applies to the data analysis and reporting module of the system. It focuses on retrieving, sorting, and presenting a subset of capital city data from the system’s database — specifically, the top N most populated capitals.
It does not include functions related to data entry, user authentication, or editing of population records.

**Level:**
This is a user goal level use case — it represents a full task that delivers direct, meaningful value to the end user (the employee).

**Preconditions:**
The system must already have a database containing city data, including name, population, area/continent, and capital status fields.
The employee must be logged into the system or have the necessary permissions to access reporting features.
The user must enter a valid area and a valid integer value for N.

**Success Condition:**
The system successfully retrieves and displays a sorted list of the top N most populated capital cities in the specified area.
The output is shown in a clear and organized report that allows easy comparison and analysis.
The report can optionally be exported or saved (if supported).

**Failed Condition:**
If the area entered is invalid, the system will show an error message: “Invalid area entered.”
If there are fewer than N capital cities in that area, the system will show all available ones and display a note.
If the database or data source is unavailable, an error message will inform the user that the report cannot be generated.

**Main Success Scenario:**
The employee opens the report generation section of the system.
The employee enters a specific area.
The employee inputs a number (N) to specify how many cities should appear in the report.
The system validates both inputs (area and N).
The system retrieves all capital cities from that area.
The system sorts them by population in descending order.
The system selects the top N cities from the sorted list.
The report is displayed in a clear table or list format.
The employee reviews, analyses, or exports the report as needed.

**Extensions:**
Invalid input: If the employee enters text instead of a number for N, display: “Please enter a valid number.”
No cities found: If no capital cities exist in that area, display: “No capital cities found in this area.”
N too large: If N exceeds the total number of available capital cities, display all results with a note: “Only X capital cities available.”
Database error: If the system cannot access data, show a general error: “Unable to retrieve data. Please try again later.”

**Sub-variations:**
The employee may choose to sort by ascending population instead.
The employee may choose to filter by continent, country, or specific population range.
The report could be generated as a visual chart or downloadable file instead of a text table.

**Schedule:**
Due Date: code review 4 (full release).