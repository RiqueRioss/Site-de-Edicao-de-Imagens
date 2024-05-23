package funcoes;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Edicao {
	
	public void salvarImagem(BufferedImage img, File arq) throws IOException {
        ImageIO.write(img, "png", arq);
    }

	public static void mudarCinza (File arquivo) throws IOException{
		
		BufferedImage img = ImageIO.read(arquivo);
		
        int width = img.getWidth();
        int height = img.getHeight();

        BufferedImage imgSaida = new BufferedImage(
                width,
                height,
                BufferedImage.TYPE_INT_BGR);

        for(int h=0; h < height; h++){
            for(int w=0; w < width; w++){
                Color cor = new Color(img.getRGB(w, h));
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                int media = (red + green + blue) / 3;
                Color novaCor = new Color(media, media, media);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        
        ImageIO.write(imgSaida, "png", arquivo);
    }
	
	public static BufferedImage mudarNegativo (BufferedImage img){
        int width = img.getWidth();
        int height = img.getHeight();

        BufferedImage imgSaida = new BufferedImage(
                width,
                height,
                BufferedImage.TYPE_INT_BGR);

        for(int h=0; h < height; h++){
            for(int w=0; w < width; w++){
                Color cor = new Color(img.getRGB(w, h));
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                Color novaCor = new Color(255-red, 255-green, 255-blue);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imgSaida;
    }
	
	public static void marcaDagua (File arquivo, File marcaD) throws IOException{
		
		BufferedImage img = ImageIO.read(arquivo);
		BufferedImage marca = ImageIO.read(marcaD);
		
        int width = img.getWidth();
        int height = img.getHeight();

        BufferedImage imgSaida = new BufferedImage(
                width,
                height,
                BufferedImage.TYPE_INT_BGR);
        
        int marcaW = marca.getWidth();
        int marcaH = marca.getHeight();

        for(int h=0; h < height; h++){
            for(int w=0; w < width; w++){
            	
            	if (h < marcaH && w < marcaW ) {
            		Color corMarca = new Color(marca.getRGB(w, h));
					imgSaida.setRGB(w, h, corMarca.getRGB());
					continue;
				}
            	
                Color cor = new Color(img.getRGB(w, h));
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                Color novaCor = new Color(red, green, blue);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        
        ImageIO.write(imgSaida, "png", arquivo);
    }
}
