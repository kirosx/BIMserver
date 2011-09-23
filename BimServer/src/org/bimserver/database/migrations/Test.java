package org.bimserver.database.migrations;

/******************************************************************************
 * Copyright (C) 2011  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import java.io.File;

import org.bimserver.database.migrations.steps.Step0000;

public class Test {
	public static void main(String[] args) {
		new Test().start();
	}

	private void start() {
		Schema schema = new Schema();
		
		Step0000 step0001 = new Step0000();
		step0001.migrate(schema);
		
		schema.writeToEcore(new File("model.ecore"));
	}
}
