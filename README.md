# BankAccount Project

## Descripción

El proyecto **BankAccount** es una aplicación de gestión bancaria desarrollada en Java. Esta solución permite a los usuarios manejar diferentes tipos de cuentas bancarias, como cuentas de ahorro (**SavingsAccount**) y cuentas corrientes (**CheckingAccount**). El sistema incluye funciones como depósitos, retiros, cálculo de intereses, manejo de sobregiros y generación de estados de cuenta mensuales.

El código está diseñado con un enfoque modular, orientado a objetos, y ha sido rigurosamente probado utilizando pruebas unitarias con JUnit 5.

---

## Características

- **Cuenta de Ahorros (SavingsAccount):**
  - Activación basada en el saldo mínimo requerido.
  - Aplicación de tarifas por retiros excesivos.
  - Generación de intereses mensuales.
  - Impresión de detalles de la cuenta.

- **Cuenta Corriente (CheckingAccount):**
  - Gestión de sobregiros.
  - Reducción de sobregiros mediante depósitos.
  - Cálculo y deducción de tarifas mensuales.
  - Impresión de detalles de la cuenta.

- **Pruebas Unitarias:**
  - Cobertura completa de métodos clave en ambas clases.
  - Validación del comportamiento bajo diferentes escenarios.

---

## Estructura del Proyecto
![Estructura](../bankaccount/images/structure
.png)
.
├── src
│   ├── main
│   │   └── java
│   │       └── project
│   │           └── bankacount
│   │               ├── Account.java
│   │               ├── App.java
│   │               ├── CheckingAccount.java
│   │               └── SavingsAccount.java
│   └── test
│       └── java
│           └── project
│               └── bankacount
│                   ├── AccountTest.java
│                   ├── AppTest.java
│                   ├── CheckingAccountTest.java
│                   └── SavingsAccountTest.java


## Diagrama UML

A continuación, se incluye el diagrama UML que ilustra las relaciones entre las clases principales del proyecto. Puedes visualizar el diagrama en la siguiente imagen:

![Diagrama UML](images/Class_UML
.png)

Para añadir o actualizar el diagrama UML, reemplaza la imagen en la carpeta `uml` con un archivo PNG del nuevo diagrama.

---

## Instalación

1. **Clona el repositorio**:
   ```bash
   git clone https://github.com/tuusuario/bank-account-project.git
   cd bank-account-project