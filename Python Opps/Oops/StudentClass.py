class Student:
    # Constructor with two parameters: name and house
    def __init__(self, name, house): # its constructed on memory 
        # Storing the two parameters as instance variables using 'self'
        self.name = name
        self.house = house
        # These instance variables will hold the values provided during object creation


def main():
    student = get_student()
    print(f"{student.name} is from {student.house}")

def fun():
    student = get_student_Cons()
    print(f"{student.name} is from {student.house}")

def get_student():
   # Function to create and return a Student object
    student = Student()  # Creating an instance (object) of the Student class, 'student' is the reference variable
    student.name = input("Name: ")  # Assigning user input to the 'name' instance variable of the student object
    student.house = input("House: ")  # Assigning user input to the 'house' instance variable of the student object
    return student  # Returning the created student object


def get_student_Cons():
    # Function to collect user input and create a Student object using the constructor
    name = input("Name: ")  # Prompting the user for the 'name'
    house = input("House: ")  # Prompting the user for the 'house'
    
    # Creating a Student object by passing the user-provided name and house to the constructor
    student = Student(name, house)  # Calls the Student constructor with the input values as arguments and its constructing a object
    return student  # Returning the created Student object

if __name__ == "__main__":
    fun()