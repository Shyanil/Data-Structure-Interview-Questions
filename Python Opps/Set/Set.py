class Set:
    set_keyA_va = set()

    @classmethod
    def removeDuplicate(cls, fruit_list, target_key):
        for data in fruit_list:
            for key in data:
                if key == target_key:
                    value = data[key]
                    cls.set_keyA_va.add((key, value))
        return f"The Non duplicate item are {cls.set_keyA_va} "  # Return the result




def main():
    fruit_list = [
        {"fruit": "apple", "price": "30"},
        {"fruit": "banana", "price": "10"},
        {"fruit": "cherry", "price": "15"},
        {"fruit": "date", "price": "25"},
        {"fruit": "fig", "price": "20"},
        {"fruit": "fig", "price": "20"}

    ]


    print(Set.removeDuplicate(fruit_list , "fruit"))

if __name__ == '__main__':
    main()
