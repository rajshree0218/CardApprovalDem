# CardApprovalDem
demo Card Approval application, using spring boot and drools rule set

Title : Rapid Commercial Card Approval System
Description : You're tasked with developing a simplified rule-based system for a financial institution to 
automate the approval process specifically for commercial card applications. Given the time constraint of 
2 hours, the goal is to implement essential rules for swift decision-making tailored to commercial card 
applications

Duration of the Interview : 2 hours

Subtasks:

Application Data:
Business name
Annual revenue
Number of years in business
Requested credit limit
Type of commercial card (e.g., corporate, purchasing, travel)

Approval Rules:
Approve applications if annual revenue exceeds X, where X is a configurable threshold.
Approve applications if the number of years in business is above Y, where Y is a configurable 
threshold.
Adjust approval criteria based on the type of commercial card requested.
Apply specific rules for different commercial card types (e.g., stricter criteria for travel cards due 
to higher risk).

Decision Outputs:
Display a concise message indicating approval or rejection along with the reason(s) based on the 
applied rules.

Rule Definition:
Define basic rules in Drools DSL or rules file to evaluate revenue, years in business, and card type 
against predefined thresholds and criteria.

Data Integration:
Implement a straightforward data input method (e.g., command-line interface, simple form) to 
gather application details including the type of commercial card.

Rule Evaluation:
Utilize Drools to swiftly evaluate the application data against the defined rules and generate 
immediate decisions based on the card type.

Output Generation:
Present the approval decision and reasoning directly on the console or in a basic user interface for 
quick review.

Testing and Validation:
Conduct rapid testing using sample data to verify that the system accurately determines approvals 
and rejections based on the implemented rules and card-specific criteria.

Efficiency
Assess the engineer's ability to swiftly implement core rules and ensure fast decision-making 
tailored to commercial card applications.

Accuracy
Verify that the system correctly approves or rejects applications based on the provided data and 
rules, considering different commercial card types.

Adaptability
Evaluate how well the engineer adjusts approval criteria based on the type of commercial card 
requested, demonstrating an understanding of varying risk profiles.

Simplicity
Consider the simplicity and clarity of the implemented solution within the 2-hour time constraint
