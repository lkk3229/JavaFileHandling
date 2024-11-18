package pdfFiles;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadPDF {

	public static void main(String[] args) throws IOException {
		
		File pdfFile=new File(".\\data\\sample.pdf");
	
		//load pdf document
		//PDDocument document = PDDocument.load(pdfFile); //2.x
		PDDocument document = Loader.loadPDF(pdfFile); //3.x
		
		PDFTextStripper pdfStripper=new PDFTextStripper();
		String text=pdfStripper.getText(document);
	
		document.close();
		System.out.println(text);
	}

}
