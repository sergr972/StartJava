package Lesson_2;

public class Jaeger {
        private String modelName;
        private String mark;
        private float height;
        private float weight;

        public Jaeger() {
        }

        public Jaeger(String modelName, String mark, float height, float weight) {
                this.modelName = modelName;
                this.mark = mark;
                this.height = height;
                this.weight = weight;
        }

        public String getModelName() {
                return modelName;
        }

        public void setModelName(String modelName) {
                this.modelName = modelName;
        }

        public String getMark() {
                return mark;
        }

        public void setMark(String mark) {
                this.mark = mark;
        }

        public float getHeight() {
                return height;
        }

        public void setHeight(float height) {
                this.height = height;
        }

        public float getWeight() {
                return weight;
        }

        public void setWeight(float weight) {
                this.weight = weight;
        }

        void  move() {
                System.out.println("шагает");
        }

        void scanKaiju() {
                System.out.println("сканирует");
        }
}





