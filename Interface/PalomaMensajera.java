
/**
 * PalomaMensajera
 *
 * 
 * @author  FRoM 
 * @version 2014
 */
public class PalomaMensajera extends Msn implements Comunicador
{
    public PalomaMensajera(String mens)
    {
        super(mens);
    }
        
    public void enviaMensaje(  )
    {
        System.out.println( getMsn() +  "    Soy una Paloma Mensajera enviando un mensaje" );
    }    
}
