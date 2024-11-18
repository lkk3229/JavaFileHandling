package pdfFiles;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

public class CreatePDF {

	public static void main(String[] args) throws IOException {
		
		//Create a new pdf document
		PDDocument document = new PDDocument(); 
		
		//Create a new page
		PDPage page=new PDPage(PDRectangle.A4);
		
		document.addPage(page);
		
		//Create content stream
		PDPageContentStream contentstream=new PDPageContentStream(document,page);
		
		//Font & Size
	    //contentstream.setFont(PDType1Font.COURIER, 14); //2.x
		
		PDType1Font font=new PDType1Font(Standard14Fonts.FontName.HELVETICA);
		contentstream.setFont(font, 14);	
		
		contentstream.beginText();
		contentstream.newLineAtOffset(50, 700);
		contentstream.showText("Hello welcome to pdf box");
		contentstream.endText();
		
		contentstream.close();
		
		//save pdf document
		document.save(".\\data\\newsample.pdf");
		
		document.close();
		
		System.out.println("PDF created successfully.....");
		
		
	}

}
