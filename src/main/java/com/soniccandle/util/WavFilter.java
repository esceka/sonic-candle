package com.soniccandle.util;

import java.io.File;
import javax.swing.filechooser.*;

public class WavFilter extends FileFilter{

	//Accept all directories and all wav files.
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }
 
        String extension = Utils.getExtension(f);
        if (extension != null) {
            if (extension.equals(Utils.wav)) {
                    return true;
            } else {
                return false;
            }
        }
 
        return false;
    }
 
    //The description of this filter
    public String getDescription() {
        return "Wave Files (.wav)";
    }
}
