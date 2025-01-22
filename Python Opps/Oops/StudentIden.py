def main():
    # student = get_student()
    newStudent = get_student_dic()
    # print(f"The {student[0]} from {student[1]}")
    print(f"The {newStudent['name']} from {newStudent['house']}")
    



# now the tuple
def get_student():
    name = input("Name : ")
    house = input("House : ")
    return (name , house) # its can't change values
    # return [name , house]  its can change values 
    

def get_student_dic():
    student = {} # decenary define
    student["name"] = input("Name :")
    student["house"] = input("House :")
    return student
    

if __name__ == "__main__":
    main()