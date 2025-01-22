# The main function take name and house name using function
def main():
    # name = get_name()
    # house = get_house()
    name , house = get_student() # here i call the tuple
    print(f"The {name} from {house}")

def get_name():
    return input("Name: ")

def get_house():
    return input("House: ")

# here i returns a tuple list of name and house
# and its immutable can't change
def get_student():
    name = input("Name: ")
    house = input("House: ")
    return (name , house)

# In simple terms, `if __name__ == "__main__":` makes sure that certain code (like `main()`) only runs when the Python file
# is executed directly, and **not** when it's imported into another file.
if __name__ == "__main__":  # here name is Student.py
    main()
    
