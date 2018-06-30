/**
 *  SleepIQ Bed
 *
 *  Copyright 2018 Jason Woodrich (@jwoodrich on github)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
metadata {
	definition (name: "SleepIQ Bed", namespace: "jwoodrich", author: "Jason Woodrich") {
		capability "Presence Sensor"
		capability "Sensor"
		capability "Sleep Sensor"
        attribute "sleepNumber", "number"
        attribute "pressure", "number"
	}


	simulator {
		// TODO: define status and reply messages here
	}

	tiles {
        valueTile("presence", "device.presence", decoration: "flat", canChangeIcon: true) {
            state "default", label:'${currentValue}', icon: "st.Bedroom.bedroom2"
        }
        valueTile("sleeping", "device.sleeping", decoration: "flat", canChangeIcon: true) {
            state "default", label:'${currentValue}', icon: "st.Bedroom.bedroom2"
        }
        valueTile("sleepNumber", "device.sleepNumber", decoration: "flat", canChangeIcon: true) {
            state "default", label:'${currentValue}'
        }
        valueTile("pressure", "device.pressure", decoration: "flat", canChangeIcon: true) {
            state "default", label:'${currentValue}'
        }
		main (["presence"])
		details(["presence","sleeping","sleepNumber","pressure"])
	}
}

// parse events into attributes
def parse(String description) {
	log.debug "Parsing '${description}'"
	// TODO: handle 'presence' attribute
	// TODO: handle 'sleeping' attribute

}