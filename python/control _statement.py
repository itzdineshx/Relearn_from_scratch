"""
break: Exit the loop.

continue: Skip current iteration.

else: Special clause that runs only if loop didn’t break.

"""

for attempt in range(3):
    pwd = input("Enter password: ")
    if pwd == "secret":
        print("Welcome!")
        break
else:
    print("Account locked.")
