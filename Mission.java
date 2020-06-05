package com.jetbrains;

public class Mission {


        private String missionId;
        private String missionName;
        private String missionDescription;
        private String missionLaunchDate;
        private String missionDuration;
        private String originCountry;
        private String cargoType;
        private String missionDestination;

        public Mission(){

        }

        public Mission(String missionId, String missionName,String missionDescription, String missionLaunchDate,
                         String missionDuration, String originCountry, String cargoType, String missionDestination){
            this.missionId = missionId;
            this.missionName = missionName;
            this.missionDescription = missionDescription;
            this.missionLaunchDate = missionLaunchDate;
            this.missionDuration = missionDuration;
            this.originCountry = originCountry;
            this.cargoType = cargoType;
            this.missionDestination = missionDestination;

        }

        /**
         *used to retrieve missionId
         */
        public String getMissionId() {
            return missionId+",";
        }
        /**
         *used to update or setMissionId
         */
        public void setMissionId(String missionId) {
            this.missionId = missionId;
        }
        /**
         *used to retrieve Mission name
         */
        public String getMissionName() {
            return missionName;
        }
        /**
         *used to update or set Mission Name
         */

        public void setMissionName(String missionName) {
            this.missionName = missionName;
        }
        /**
         *used to retrieve Mission Description
         */
        public String getMissionDescription() {
            return missionDescription;
        }

        /**
         *used to update or set Mission Description
         */

        public void setMissionDescription(String missionDescription) {
            this.missionDescription = missionDescription;
        }
        /**
         *used to retrieve Mission LaunchDate
         */
        public String getMissionLaunchDate() {
            return missionLaunchDate;
        }
        /**
         *used to update or set Mission LaunchDate
         */

        public void setMissionLaunchDate(String missionLaunchDate) {
            this.missionLaunchDate = missionLaunchDate;
        }
        /**
         *used to retrieve Mission Duration
         */
        public String getMissionDuration() {
            return missionDuration;
        }
        /**
         *used to update or set Mission Duration
         */

        public void setMissionDuration(String missionDuration) {
            this.missionDuration = missionDuration;
        }

        /**
         *used to retrieve Origin Country
         */
        public String getOriginCountry() {
            return originCountry;
        }
        /**
         *used to update or set Origin Country
         */

        public void setOriginCountry(String originCountry) {
            this.originCountry = originCountry;
        }
        /**
         *used to retrieve Cargo Type
         */
        public String getCargoType() {
            return cargoType;
        }
        /**
         *used to update or set mission Destination
         */
        public void setCargoType(String cargoType) {
            this.cargoType = cargoType;
        }

        /**
         *used to retrieve Mission Destination
         */
        public String getMissionDestination() {
            return missionDestination;
        }
        /**
         *used to update or set Mission Destination
         */

        public void setMissionDestination(String missionDestination) {
            this.missionDestination = missionDestination;
        }
  }



