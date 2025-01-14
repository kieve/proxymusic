//------------------------------------------------------------------------------------------------//
//                                                                                                //
//                                   M e a s u r e A d a p t e r                                  //
//                                                                                                //
//------------------------------------------------------------------------------------------------//
// <editor-fold defaultstate="collapsed" desc="hdr">
//  Copyright © Herve Bitteur and others 2000-2016. All rights reserved.
//  This software is released under the GNU Lesser General Public License v3.
//  Go to https://github.com/Audiveris/proxymusic/issues to report bugs or suggestions.
//------------------------------------------------------------------------------------------------//
// </editor-fold>
package org.audiveris.proxymusic.util;

import org.audiveris.proxymusic.ScorePartwise.Part.Measure;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.stream.XMLStreamWriter;

/**
 * Class {@code MeasureAdapter} inserts a comment line before marshalling a measure.
 * (class no longer used, but kept as example)
 *
 * @author Hervé Bitteur
 */
public class MeasureAdapter
    extends XmlAdapter<Measure, Measure>
{
    //~ Instance fields ----------------------------------------------------------------------------

    private XMLStreamWriter xmlStreamWriter;

    //~ Constructors -------------------------------------------------------------------------------

    /**
     * Creates a new {@code MeasureAdapter} object.
     */
    public MeasureAdapter ()
    {
    }

    /**
     * Creates a new {@code MeasureAdapter} object with a stream writer.
     *
     * @param xmlStreamWriter the output writer
     */
    public MeasureAdapter (XMLStreamWriter xmlStreamWriter)
    {
        this.xmlStreamWriter = xmlStreamWriter;
    }

    //~ Methods ------------------------------------------------------------------------------------

    @Override
    public Measure marshal (Measure measure)
        throws Exception
    {
        xmlStreamWriter.writeComment("=======================================================");

        return measure;
    }

    @Override
    public Measure unmarshal (Measure measure)
        throws Exception
    {
        return measure;
    }
}
