# define a function that takes two numbers as input and returns their sum
def sum_of_two(num_one, num_two):
    # check if both numbers are negative
    if num_one < 0 and num_two < 0:
        return -sum_of_two(-num_one, -num_two)
    # if num_one is negative, swap it with num_two and call the function recursively
    elif num_one < 0:
        return sum_of_two(num_two, num_one)
    # if num_two is negative, add abs(num_two) to num_one using a loop
    elif num_two < 0:
        for i in range(abs(num_two)):
            num_one -= 1
        return num_one
    # if both numbers are positive, add num_two to itself num_one times
    else:
        for _ in range(num_one):
            num_two += 1
        return num_two

# ask the user to input two numbers and add them together
print('Add 2 numbers:')

# get first number from the user
while True:
    try:
        num_one = int(input('First number: '))
        break
    except ValueError:
        print("Invalid input. Please enter an integer.")

# get second number from the user
while True:
    try:
        num_two = int(input('Second number: '))
        break
    except ValueError:
        print("Invalid input. Please enter an integer.")

# call the sum_of_two function to calculate the sum of the two numbers
result = sum_of_two(num_one, num_two)

# output the result to the console
print("The sum of two numbers:", result)
