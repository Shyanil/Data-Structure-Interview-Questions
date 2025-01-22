class StudentWithHouse:
    def __init__(self, name, house):
        # Constructor to initialize a student with a name and a house
        if not name:
            # Raise an error if the name is empty
            raise ValueError("The Name is Empty")
        # Assign the name and house to instance variables **Constructor parameters** are the values you provide when
        # creating an object, used to set up the object. **Instance variables** are the properties of the object that
        # hold data specific to that object and can be used throughout its lifetime.
        self.name = name # self give me access to the current object in memory
        # If you use an underscore (e.g., `self._name`) in the `__init__` method, it bypasses the setter method,
        # skipping any validation. If you assign directly to the property (e.g., `self.name`), it invokes the setter,
        # allowing for error checking and validation.
        # self._house = house # it never calls the setter method
        self.house = house

    # This called when i try to print StudentWithHouse reference variable
    def __str__(self):
        # The __str__() dunder method returns a reader-friendly string representation of a class object.
        return f"The Student name is {self.name} and he/she are in {self.house} house."


    # we have instance variable called house also function name house that's why we assign or return with _house
    # getter
    @property
    def house(self):
        # Return the value of the _house instance variable
        # The @property decorator allows access to this method as if it were an attribute
        return self._house  # _house is the actual private instance variable that holds the house value

    # Setter method for house
    @house.setter
    def house(self, house):
        # Check if the provided house is valid; raise an error if it's not
        if house not in ["Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"]:
            raise ValueError("Invalid house")
        # Assign the valid house value to the instance variable _house
        # house here is a property, and we are storing the value in the _house private instance variable
        self._house = house  # _house stores the validated house value

    @property
    def name(self):
        """Getter method for the 'name' property.

        Returns:
            str: The value of the private instance variable '_name'.

        This method provides controlled access to the '_name' attribute
        without exposing it directly.
        """
        return self._name  # Return the value of '_name' directly; validation occurs in the setter.

    @name.setter
    def name(self, name):
        """Setter method for the 'name' property.

        Args:
            name (str): The name to set for the instance.

        Raises:
            ValueError: If the provided name is not in the allowed list.

        This method validates the input name before assigning it to the
        private instance variable '_name'. Only specific names are accepted.

        """

        # List of valid names to check against.
        valid_names = ["Harry Potter", "Cedric Diggory", "Luna Lovegood", "Draco Malfoy"]

        # Validate that the provided name is in the list of valid names.
        if name not in valid_names:
            raise ValueError("Wrong House")  # Raise an error if the name is invalid.

        # Assign the validated name to the private instance variable '_name'.
        self._name = name  # Sets the valid name to the '_name' attribute.


def main():
    # Main function to run the program
    student = get_Student()  # Call the function to get student details
    # When you access or assign a value to student.house, it is not directly accessing an instance variable but
    # rather going through these getter/setter methods.
    # student.house = "The demo House" # this line show me error on 27 line because that are not match here is assign
    # operator means i call the setter
    if student:  # Check if a valid student object is returned
        print(student) # its call the str method and print


def get_Student():
    # Function to collect user input for a student's name and house
    while True:  # Loop until valid input is received
        name = input("Name: ")  # Prompt the user for the student's name
        house = input("House: ")  # Prompt the user for the student's house
        try:
            # Attempt to create a StudentWithHouse object with the provided name and house
            return StudentWithHouse(name, house)
        except ValueError as e:
            # Print the error message if a ValueError is raised during object creation
            print(e)  # Print the error message


if __name__ == "__main__":
    # Entry point of the program; calls the main function when the script is run
    main()
