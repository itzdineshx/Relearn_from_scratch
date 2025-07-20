status = ("sensor", 200)

match status:
    case ("sensor", code) if code == 200:
        print("Sensor is OK")
    case ("sensor", code):
        print(f"Sensor error {code}")
    case _:
        print("Unknown device")
