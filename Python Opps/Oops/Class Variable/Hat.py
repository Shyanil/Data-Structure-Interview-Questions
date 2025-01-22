from random import choice


class Hat:
    # Class variable accessible from anywhere in the class methods
    houses = ["Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"]

    @classmethod  # This is a class method, which means it can be called on the class itself, not just on instances of the class
    def sort(cls, name):  # 'cls' refers to the class itself, similar to how 'self' refers to the instance in instance methods
        # The 'cls' parameter allows us to access class-level variables and methods
        # Unlike instance methods that operate on an object of the class (using 'self'), class methods operate on the class itself
        # This is useful for operations that should apply to the class as a whole, rather than any specific instance
        print(f"The {name} is sorted into {choice(cls.houses)}")  # Randomly selects and prints a house for the given name

print(Hat.sort("Harry"))  # now i am not instancing a object of hat
