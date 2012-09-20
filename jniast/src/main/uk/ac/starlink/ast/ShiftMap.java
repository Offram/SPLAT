/* ********************************************************
 * This file automatically generated by ShiftMap.pl.
 *                   Do not edit.                         *
 **********************************************************/

package uk.ac.starlink.ast;


/**
 * Java interface to the AST ShiftMap class
 *  - add a constant value to each coordinate. 
 * A ShiftMap is a linear Mapping which shifts each axis by a
 * specified constant value.
 * <h4>Licence</h4>
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public Licence as
 * published by the Free Software Foundation; either version 2 of
 * the Licence, or (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be
 * useful,but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE. See the GNU General Public Licence for more details.
 * <p>
 * You should have received a copy of the GNU General Public Licence
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place,Suite 330, Boston, MA
 * 02111-1307, USA
 * 
 * 
 * @see  <a href='http://star-www.rl.ac.uk/cgi-bin/htxserver/sun211.htx/?xref_ShiftMap'>AST ShiftMap</a>  
 */
public class ShiftMap extends Mapping {
    /** 
     * Creates a ShiftMap.   
     * <p>
     *       The number of input coordinates is equal to the number of output 
     *       coordinates, and is equal to the number of elements in the 
     *       supplied <code>shift</code> array.
     *    
     * @param  shift  An array containing the values to be added on to the input 
     * coordinates in order to create the output coordinates. A separate
     * value should be supplied for each coordinate.
     * 
     * @throws  AstException  if an error occurred in the AST library
    */
    public ShiftMap( double[] shift ) {
        construct( shift );
    }
    private native void construct( double[] shift );

}