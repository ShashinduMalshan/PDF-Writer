# PDF-Writer

A Java application for generating PDF invoices for a Mental Health Therapy Center. This project demonstrates how to create structured PDF documents with tables, formatted text, and automatic opening of the generated file.

## Features

- Generate professional-looking PDF invoices
- Include formatted text with different fonts and styles
- Create structured tables for invoice line items
- Calculate and display totals, payments, and balances
- Automatically open the generated PDF (if supported by the system)

## Requirements

- Java 17 or higher
- Maven 3.6 or higher

## Dependencies

- [OpenPDF](https://github.com/LibrePDF/OpenPDF) 1.3.30 - A free Java library for creating and manipulating PDF files

Add the following dependency to your `pom.xml`:

```xml

<dependency>
    <groupId>com.github.librepdf</groupId>
    <artifactId>openpdf</artifactId>
    <version>1.3.30</version>
</dependency>
```

## Installation

1. Clone the repository:
   ```
   git clone https://github.com/yourusername/pdf-writer.git
   cd pdf-writer
   ```

2. Build the project with Maven:
   ```
   mvn clean package
   ```

## Usage

Run the application using Maven:

```
mvn exec:java -Dexec.mainClass="com.service.InvoiceGenerator"
```

Or run the compiled JAR file:

```
java -jar target/pdf-1.0-SNAPSHOT.jar
```

The application will generate an invoice.pdf file in the project root directory and attempt to open it automatically.

## Customization

You can modify the `InvoiceGenerator.java` file to customize:

- Invoice details (patient name, invoice ID, etc.)
- Line items in the invoice table
- Formatting and styling of the PDF
- Output file name and location

## Example Output

The generated PDF includes:
- Mental Health Therapy Center header
- Patient information and invoice ID
- A table with therapy session details (date, program, time, cost)
- Total, paid, and balance amounts
- A thank you message

## License

This project is available under the MIT License. See the LICENSE file for more details.

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.
