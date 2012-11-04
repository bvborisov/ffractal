/*
 * This file is part of FFractal.
 * 
 * FFractal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * FFractal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with FFractal.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright 2010
 * 	Guilhelm Savin
 */
package org.ri2c.flame;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Context
{
	//BiunitSquare<Point> points;
	LinkedList<FFunction> flameFunctions;
	FFunction finalFlameFunction;
	Random random = new Random();
	double [] xyc;
	double [] initialPoint;
	
	public Context()
	{
		flameFunctions = new LinkedList<FFunction>();

		random = new Random();

		xyc = new double [3];
		xyc [0] = random.nextDouble() * 2 - 1;
		xyc [1] = random.nextDouble() * 2 - 1;
		xyc [2] = random.nextDouble();
		
		initialPoint = new double [] { random.nextDouble(), random.nextDouble() };
	}

	public int getFFuntionCount()
	{
		return flameFunctions.size();
	}
	
	public FFunction getFFunction( int index )
	{
		return flameFunctions.get(index);
	}
	
	public void setInitialPoint( double x, double y )
	{
		initialPoint [0] = x;
		initialPoint [1] = y;
	}
	
	public double [] getInitialPoint()
	{
		return Arrays.copyOf( initialPoint, 4 );
		
		
		
		}
	
	public void addFlameFunction( FFunction ff )
	{
		flameFunctions.add(ff);
	}

	
	public void compute( double [] xyc )
	{
		flameFunctions.get(random.nextInt(flameFunctions.size())).compute(xyc);
		
		if( finalFlameFunction != null )
			finalFlameFunction.compute(xyc);
	}

	
	
}