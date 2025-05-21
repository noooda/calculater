# Functional Requirements

## User Input
Prompt the user to input two numbers.
Prompt the user to input an arithmetic operator: +, -, *, /, %.

## Operations
Support the following operations:
- Addition (+)
- Subtraction (-)
- Multiplication (*)
- Division (/) (handle division by zero)
- Modulus (%) (handle division by zero)

## Output
Display the result of the calculation in the format
Result: <calculated_value>

## Error Handling
- If the user inputs an invalid operator, display an error message.
- Handle input mismatches (e.g., if the user enters a non-numeric value).
- Gracefully handle divide-by-zero errors.

## Loop Option (Optional for expansion)
Allow the user to perform multiple calculations until they choose to exit (e.g., input q to quit).

## Technical Constraints
Use only standard Java libraries (Scanner, System.out, etc.).
Use primitive types like int or double.
Apply basic control flow (if, switch, while/do-while for loop if needed).