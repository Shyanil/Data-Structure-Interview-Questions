class Wizard:
    # The initializer method that takes a name variable
    def __init__(self, name):
        # Raise an error if the name is empty
        if not name:
            raise ValueError("NAME PLEASE")
        self.name = name  # Store the name in an instance variable

    # Override the __str__ method to provide a string representation of the object
    def __str__(self):
        # Call the superclass's __str__ method
        return super().__str__()


# Child class that inherits from Wizard
class Student(Wizard):
    def __init__(self, name, house):
        # Call the parent class's __init__ method to set the name
        super().__init__(name)
        self.house = house  # Store the house in an instance variable

    # Override the __str__ method for a custom string representation
    def __str__(self):
        # Return a formatted string with the name and house
        return f"{self.name}, {self.house}"


# Another child class that inherits from Wizard
class Professor(Wizard):
    def __init__(self, name, subject):
        # Call the parent class's __init__ method to set the name
        super().__init__(name)
        self.subject = subject  # Store the subject in an instance variable

    # Override the __str__ method for a custom string representation
    def __str__(self):
        # Return a formatted string with the name and subject
        return f"{self.name}, {self.subject}"


def main():
    # Create an instance of Wizard
    wiz = Wizard("Shyanil")  # Only calls the Wizard class's initializer
    # Create an instance of Student, which also calls the Wizard's initializer
    stu = Student("Shyanil", "Kolkata")  # Calls both parent and own init methods
    # Create an instance of Professor
    pfo = Professor("Shyanil", "Machine Learning")

    # Print the string representations of the created instances
    print(wiz)
    print(stu)
    print(pfo)


if __name__ == "__main__":
    main()  # Call the main function to execute the program
