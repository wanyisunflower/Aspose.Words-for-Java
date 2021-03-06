/* 
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Words. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
package com.aspose.words.examples.programming_documents.Ranges;

import com.aspose.words.Document;
import com.aspose.words.examples.Utils;


public class RangesDeleteText
{
    private static String gDataDir;

    public static void main(String[] args) throws Exception
    {
        //ExStart:1
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(RangesDeleteText.class);

        Document doc = new Document(dataDir + "Document.doc");
        doc.getSections().get(0).getRange().delete();

        doc.save(dataDir + "output.doc");
      //ExEnd:1
    }
}