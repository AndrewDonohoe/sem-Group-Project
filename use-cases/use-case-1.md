**Goal In Context:**
As an employee I want to produce a report of all the countries in a specific area that I enter sorted by largest population to smallest so that I can analyse the information of all those countries.

**Scope**
Company.

**Level**
Primary task.

**Preconditions**
We know the geographic area. Database is loaded. Database contains country information.

**Success End Condition**
A report is available for the employee.

**Failed End Condition**
No report is produced.
If the area entered is invalid or no countries exist in that area, the system displays an error or message: “No countries found in this area.”

**Primary Actor**
The employee.

**Trigger**
A request for country population information is sent to the employee.

**Main Success Scenario**
1. Manager requests for country reports ordered by population size of given geographic area
2. Employee captures the geographic area to get the countries information for.
3. Employee extracts the information of the country reports from the given geographic area.
4. Employee reports back to manager.

**Extensions**
3. The given geographic area does not exist:
   i. Employee informs manager that the geographic area doesn't exist.

**Sub-Variations**
None.

**Schedule**
DUE DATE: Code Review 4 (Full Release)