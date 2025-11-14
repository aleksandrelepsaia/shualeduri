# Shualeduri - Android E-Commerce App

This is an Android application project for a midterm assignment that implements a shopping cart flow with four main screens.

## Project Structure

### Activities (Screens)

1. **CartActivity** - Empty cart screen (Main/Launch Activity)
2. **ProductActivity** - Product detail screen
3. **MyCartActivity** - Shopping cart with items
4. **SuccessfullyPopActivity** - Payment success screen

### Navigation Flow

- **Cart** → **Product**: Click "Start Shopping" button
- **Product** → **My Cart**: Click "Add to Cart" button (passes product price via Intent)
- **My Cart** → **Successfully Pop**: Click "Place Order" button
- **My Cart** → **Product**: Click back arrow (finish())
- **Product** → **Cart**: Click cart icon (finish())
- **Successfully Pop** → **Cart**: Click "DONE" button (clears activity stack)

### Data Management

- **Price Passing**: Product price (120$) is passed from `ProductActivity` to `MyCartActivity` using `Intent.putExtra()`
- **Quantity Management**: 
  - Starting quantity: 2
  - "+" button increases quantity and recalculates total
  - "-" button decreases quantity (minimum: 1) and recalculates total
  - Total = Product Price × Quantity
- **Subtotal**: Dynamically updates based on quantity

## Key Features

✅ Four Activities with proper navigation
✅ Intent-based data passing (Product price)
✅ Quantity increment/decrement with validation
✅ Dynamic total price calculation
✅ Back navigation using finish()
✅ ViewBinding for modern Android development

## Setup Instructions

1. Open the project in Android Studio
2. Sync Gradle files
3. Build the project
4. Run on an emulator or physical device

## Requirements Met

- ✅ 4 screens (Activities) created
- ✅ Navigation between all screens implemented
- ✅ Data passing using Intent.putExtra() and getIntExtra()
- ✅ Quantity management with +/- buttons
- ✅ Total price calculation (price × quantity)
- ✅ Quantity validation (cannot go below 1)
- ✅ Back navigation using finish()

## Technical Details

- **Language**: Kotlin
- **UI**: XML Layouts with ViewBinding
- **Min SDK**: 24
- **Target SDK**: 34
- **Build Tools**: Gradle 8.0

