# ⏰ Clock Appointment Checker

## 📌 Overview

This program is a simple Java application that determines whether a user is **late** or **on time** for an appointment.

The program compares:

* A fixed appointment time (**12:30 p.m.**)
* A time entered by the user

Based on the comparison, it outputs:

* ✅ "You're not late!"
* ❌ "You're late!"

---

## 🧠 How It Works

1. The program creates a preset appointment time:

   ```
   12:30 p.m.
   ```

2. It prompts the user to enter:

   * Hour
   * Minutes
   * a.m. or p.m.

3. A `Clock` object is created using the user's input.

4. The program compares the user’s time with the appointment time using:

   ```
   Clock.getEarlier()
   ```

5. If the user's time is earlier than or equal to the appointment:

   * ✅ Not late

   Otherwise:

   * ❌ Late

---

## 🧩 Project Structure

### `Lab3aStartingCode.java`

* Contains the `main` method
* Handles user input
* Creates `Clock` objects
* Prints result

### `Clock.java`

Represents a time with:

* `hours`
* `minutes`
* `meridian` ("a.m." or "p.m.")

Includes:

* Constructors
* `toString()` for formatting time
* `getEarlier()` to compare two times

### `MinuteTest.java`

* JUnit test class
* Tests the `Clock` class (after fixing)

---

## ▶️ Example Run

```
What hour should the clock be set to? 11
What minute should the clock be set to? 45
Is it a.m. (a) or p.m. (p)? a

You're not late!
```

---

## ⚠️ Notes

* Uses a **12-hour clock format**
* Special logic is included for handling **12 a.m. / 12 p.m.**
* Does not convert to 24-hour time internally

---

## 🧪 Running the Program

### Compile:

```
javac Lab3aStartingCode.java Clock.java
```

### Run:

```
java Lab3aStartingCode
```

---

## 🧪 Running Tests (JUnit)

Make sure JUnit is installed, then run:

```
javac MinuteTest.java
java org.junit.runner.JUnitCore MinuteTest
```

---

## ✅ Possible Improvements

* Add input validation (prevent invalid times)
* Convert times to 24-hour format for simpler comparison
* Expand test coverage (edge cases like 12:00 a.m.)
* Improve UI/UX with better prompts

---

## 👨‍💻 Author

Kevin Turcios

---

## 📄 License

This project is for educational purposes.
