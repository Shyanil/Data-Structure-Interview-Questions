class Student:
    # Constructor method to initialize the Student object with name and house
    def __init__(self, name, house):
        self.name = name  # Assign the name to the instance variable
        self.house = house  # Assign the house using the setter method

    # String representation method to provide a readable output for the object
    def __str__(self):
        return f"The Name {self.name} from {self.house}"  # Returns a formatted string

    # Class method to create a new Student object using user input
    @classmethod
    def get(cls):
        # Prompting the user to input the student's name and house
        name = input("Name: ")  # Get student name from user input
        house = input("House: ")  # Get student house from user input

        # Return a new instance of Student created with the provided name and house
        return cls(name, house)  # Calls the class constructor with user inputs

    # Getter for the house property to access the private instance variable
    @property
    def house(self):
        return self._house  # Returns the value of the private variable

    # Setter for the house property to validate and set the house value
    @house.setter
    def house(self, value):
        # Check if the provided house value is one of the allowed houses
        if value not in ["Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"]:
            raise ValueError("Invalid house")  # Raise an error if the house is invalid

        # Set the private instance variable if valid
        self._house = value  # Assigns the validated house name to the private variable


def main():
    # Create a new Student object using the class method to get user input
    student = Student.get()  # Calls the get method to prompt for student details
    # Print the student's information using the __str__ method
    print(student)  # Outputs the formatted string representation of the student


# Entry point of the program to execute the main function
if __name__ == "__main__":
    main()  # Calls the main function when the script is executed
