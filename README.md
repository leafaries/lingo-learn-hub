# lingo-learn-hub

**Lingo-learn-hub** is a Java core module developed as a sample university project to test skills in design patterns and modular software design. The project emphasizes creating reusable core functionality for language learning, which can easily be extended by adding custom user interface (UI) modules.

## Problem Description

The following describes the problem or requirements that this repository aims to address: 

> "Aplikacja do nauki języka. Aplikacja umożliwia użytkownikowi przyswajanie słownictwa i sprawdzanie swojej wiedzy w trybach takich jak fiszki (wyświetlanie słowa lub tłumaczenia z oczekiwaniem na odpowiedź użytkownika i prezentacja poprawnej odpowiedzi), wybór poprawnego tłumaczenia spośród kilku opcji, samodzielne wpisywanie tłumaczenia. Aplikacja zachęca do regularnej nauki przy pomocy codziennych wyzwań i umożliwia powtórki słów, z którymi użytkownik miał problemy. Testy wiedzy pozwalają sprawdzić znajomość słów na podstawie wybranych zestawów. Użytkownik może tworzyć zestawy słówek, grupować je w kategorie (np. „Podróże”, „Zakupy”), śledzić postępy w nauce i generować raporty. Aplikacja oferuje eksport i import danych.

## Overview

The project is designed to facilitate the following:  
- Core functionality for vocabulary acquisition and knowledge testing.
- Multiple learning modes, including:
  - Flashcards (showing a word or its translation with user interaction).
  - Multiple-choice translation selection.
  - Manual translation input.
- Encouragement for regular learning through daily challenges and progress tracking.
- Customization with user-created word sets, categories (e.g., “Travel,” “Shopping”), and detailed progress reports.
- Support for data import/export for ease of use and scalability.

The modular architecture makes it easy to integrate new UI modules, such as desktop apps (Swing, JavaFX), mobile apps, or web apps, without modifying the core logic.

## Installation

Clone the repository to get started:

```bash
git clone https://github.com/leafaries/lingo-learn-hub.git
```

Then, build the project using your preferred Java build tool (e.g., Maven or Gradle).

## Usage

The core module is designed to handle the application's main functionality. Developers can fork the repository and create custom UI modules that connect to the core for language-learning features. Here's an example of how you might interact with the core module in Java:

```java
import com.lingo.learn.core.LanguageTrainer;

public class Main {
    public static void main(String[] args) {
        LanguageTrainer trainer = new LanguageTrainer();

        // Example usage: Get the next exercise
        System.out.println(trainer.getNextExercise());

        // Additional functionalities like progress tracking and report generation
        trainer.showProgress();
        trainer.generateReport();
    }
}
```

## License

[MIT](https://choosealicense.com/licenses/mit/)
