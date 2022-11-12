package Lesson_2;

public class Jaeger {

        private String modelName;
        private String mark;
        private float height;
        private float weight;

        void  move() {
                System.out.println("шагает");
        }

        void scanKaiju() {
                System.out.println("сканирует");
        }

        public void setModelName(String modelName) {
                this.modelName = modelName;
        }

        public String getModelName() {
                return modelName;
        }

        public void setMark(String mark) {
                this.mark = mark;
        }

        public String getMark() {
                return mark;
        }

        public void setHeight(float height) {
                this.height = height;
        }

        public float getHeight() {
                return height;
        }

        public void setWeight(float weight) {
                this.weight = weight;
        }

        public float getWeight() {
                return weight;
        }

        public Jaeger() {
        }
        public Jaeger(String modelName, String mark, float height, float weight) {
                this.modelName = modelName;
                this.mark = mark;
                this.height = height;
                this.weight = weight;
        }
}





