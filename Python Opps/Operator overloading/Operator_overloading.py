class Vault:
    # Constructor to initialize galleons, sickles, and knuts with default values of 0
    def __init__(self, galleons=0, sickles=0, knuts=0):
        self.galleons = galleons
        self.sickles = sickles
        self.knuts = knuts

    # String representation of the Vault object for easy display
    def __str__(self):
        return f"The galleons {self.galleons} , The sickles {self.sickles} , The knuts {self.knuts}"

    # Overloading the + operator to add two Vault objects
    def __add__(self, other):
        # Adding galleons, sickles, and knuts from both Vault objects
        total_galleons = self.galleons + other.galleons
        total_sickles = self.sickles + other.sickles
        total_knuts = self.knuts + other.knuts
        # Returning a new Vault object with the summed values
        return Vault(total_galleons, total_sickles, total_knuts)


def main():
    # Creating two Vault instances with initial values
    shyanil = Vault(120, 10, 50)  # First Vault instance
    mishra = Vault(10, 30, 234)  # Second Vault instance

    # Using the overloaded + operator to get the total of both Vaults
    total = shyanil + mishra

    # Printing the total Vault
    print(total)


if __name__ == "__main__":
    main()

# 1. `self` in Python refers to the instance of the class on which a method is called.
# 2. It allows access to the instance's attributes and other methods within the class.
# 3. Similar to `this` in Java, `self` helps differentiate instance variables from local variables.
#
# Here, galleons is an instance variable because each Vault object (shyanil and mishra) has its own galleons value.
# shyanil and mishra are reference variables pointing to two different instances of Vault.





