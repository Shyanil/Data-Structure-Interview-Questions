class StudentWithHouse:
    def __init__(self, name, house , patronus):
        # Constructor to initialize a student with a name and a house
        if not name:
            # Raise an error if the name is empty
            raise ValueError("The Name is Empty")
        
        # Check if the provided house is valid; raise an error if it's not
        if house not in ("Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"):
            raise ValueError("Wrong House")
        
        # Assign the name and house to instance variables
        self.name = name
        self.house = house
        self.patronus = patronus


    # This called when i try to print StudentWithHouse reference variable
    def __str__(self):
        # The __str__() dunder method returns a reader-friendly string representation of a class object.
        return f"The Student name is {self.name} and he/she are in {self.house} house."

    # own method the cast emojis
    def cast(self):
        if self.patronus == "Stag":
            return "🦌"
        elif self.patronus == "Otter":
            return "🦦"
        elif self.patronus == "Phoenix":
            return "🦅"
        elif self.patronus == "Horse":
            return "🐎"
        elif self.patronus == "Cat":
            return "🐈"
        else:
            return "✨ Unknown Patronus ✨"


def main():
    # Main function to run the program
    student = get_Student()  # Call the function to get student details
    if student:  # Check if a valid student object is returned
        print(f"{student} and patronus is {student.cast()}") # its call the str method and print


def get_Student():
    # Function to collect user input for a student's name and house
    while True:  # Loop until valid input is received
        name = input("Name: ")  # Prompt the user for the student's name
        house = input("House: ")  # Prompt the user for the student's house
        patronus = input("Patronus: ")
        try:
            # Attempt to create a StudentWithHouse object with the provided name and house
            return StudentWithHouse(name, house , patronus)
        except ValueError as e:
            # Print the error message if a ValueError is raised during object creation
            print(e)  # Print the error message


if __name__ == "__main__":
    # Entry point of the program; calls the main function when the script is run
    main()
