package com.aspose.words.examples.loading_saving;

import com.aspose.words.Document;
import com.aspose.words.LoadOptions;
import com.aspose.words.examples.Utils;

public class OpenEncryptedDocument {
    public static void main(String[] args) throws Exception {
        // ExStart:1
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(OpenEncryptedDocument.class);
        String filename = "LoadEncrypted.docx";
        Document doc = new Document(dataDir + filename , new LoadOptions("aspose"));

        doc.save(dataDir +"output.doc");
        //ExEnd:1

    }

}
