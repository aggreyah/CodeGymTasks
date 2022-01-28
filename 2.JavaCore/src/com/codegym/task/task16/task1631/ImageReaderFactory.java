package com.codegym.task.task16.task1631;

import com.codegym.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes jpg) {
        if (jpg == ImageTypes.JPG)
            return new JpgReader();
        else if (jpg == ImageTypes.BMP)
            return new BmpReader();
        else if (jpg == ImageTypes.PNG)
            return new PngReader();
        else
            throw new IllegalArgumentException("Unknown image type");
    }
}
