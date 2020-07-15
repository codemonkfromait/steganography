package steganopgraphy;

public class Steganopgraphy 
{
  public static void main(String[] args) 
  {
    try
    {
      //Embed emb = new Embed("c:\\java\\DB.zip", "c:\\java\\Koala.jpg");
      Embed emb = new Embed("D:/stegano/Demo++.c", "D:/stegano/Embed.png", "tiger");
      emb.embedFileInImage("D:/stegano/Embed1.png");
      
      Extract extr = new Extract("D:/stegano/Embed1.png", "tiger");
      String trgt = extr.getFileFromImage();
      System.out.println("File extracted as : " + trgt);
    }
    catch(Exception ex)
    {
      System.out.println("Err: " +ex);
      ex.printStackTrace();
    }
  }
}
