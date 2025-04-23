package com.service;

import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;

public class InvoiceGenerator {
    public static void main(String[] args) {
        try {
            String fileName = "invoice.pdf";
            Document doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream(fileName));
            doc.open();


            Font titleFont = new Font(Font.HELVETICA, 18, Font.BOLD);
            Font subtitleFont = new Font(Font.HELVETICA, 14, Font.BOLD);

            doc.add(new Paragraph("Mental Health Therapy Center", titleFont));
            doc.add(new Paragraph("Invoice", subtitleFont));
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph("Patient: John Doe"));
            doc.add(new Paragraph("Invoice ID: INV-001"));
            doc.add(new Paragraph(" "));


            PdfPTable table = new PdfPTable(4);
            table.setWidthPercentage(100);
            table.addCell("Date");
            table.addCell("Program");
            table.addCell("Time");
            table.addCell("Cost");

            table.addCell("2025-04-23");
            table.addCell("Stress Therapy");
            table.addCell("10:00 - 11:00");
            table.addCell("Rs. 3000");

            doc.add(table);
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph("Total: Rs. 3000"));
            doc.add(new Paragraph("Paid: Rs. 3000"));
            doc.add(new Paragraph("Balance: Rs. 0"));
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph("Thank you for your trust and patience."));

            doc.close();

            File pdfFile = new File(fileName);
            if (pdfFile.exists() && Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(pdfFile);
            }

            System.out.println("Invoice created and opened successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
