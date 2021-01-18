
package ventanas;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Añadir_binario extends ObjectOutputStream{

    public Añadir_binario(OutputStream out) throws IOException {
        super(out);
    }

    public Añadir_binario() throws IOException, SecurityException {
    }
    
    @Override
    public void writeStreamHeader() throws IOException{
        File archivo = new File("Registro_atletas.bin");
        if(archivo.length()==0){  //si el archivo esta vacio
              super.writeStreamHeader(); //coloca la acbecera del objeto padre
        }
        else{
             reset();
        }
    }
}
