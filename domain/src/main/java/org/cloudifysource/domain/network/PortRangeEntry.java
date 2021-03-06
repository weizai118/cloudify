/*******************************************************************************
 * Copyright (c) 2013 GigaSpaces Technologies Ltd. All rights reserved
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************/
package org.cloudifysource.domain.network;

/*************
 * Represents a single entry in a port range. An entry may contain a single port, or a consecutive range of ports.
 * 
 * @author barakme
 * @since 2.7.0
 * 
 */
public class PortRangeEntry {

	private Integer from = null;
	private Integer to = null;

	public Integer getTo() {
		return to;
	}

	public void setTo(final Integer to) {
		this.to = to;
	}

	public Integer getFrom() {
		return from;
	}

	public void setFrom(final Integer from) {
		this.from = from;
	}

}
