**Goal In Context:**
As an employee I want to create a report of the top N populated countries in a specific area that I enter and where N is the amount of countries that I ask for so that I can analyse the information of a specific amount of countries.

**Scope**
Company.

**Level**
Primary task.

**Preconditions**
We know the geographic area. Received the value of N. Database is loaded. Database contains country information.

**Success End Condition**
A report is available for the employee.

**Failed End Condition**
No report is produced.
If the area entered is invalid or no countries exist in that area, the system displays an error or message: “No countries found in this area.”
If the value of N is invalid, the system displays an error or message: "The value of N is invalid."

**Primary Actor**
The employee.

**Trigger**
A request for the top N populated countries in a specific area's information is sent to the employee.

**Main Success Scenario**
1. Manager requests for country reports of the top N populated countries of given geographic area.
2. Employee captures the geographic area and number of countries to get the countries information for.
3. Employee extracts the information of the country reports from the given geographic area and number of countries.
4. Employee reports back to manager.

**Extensions**
3. The given geographic area does not exist:
   i. Employee informs manager that the geographic area doesn't exist.
3. The given number of countries N is an invalid value:
   i. Employee informs manager that the value of N is invalid.

**Sub-Variations**
None.

**Schedule**
DUE DATE: Code Review 4 (Full Release)