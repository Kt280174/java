public class TrafficLight {

    // Перечисление с инициализацией значений
    public enum LightState {
        RED(1, "Stop"),
        YELLOW(2, "Caution"),
        GREEN(3, "Go");

        private final int code;          // Уникальный код для состояния
        private final String message;   // Сообщение для состояния

        // Конструктор перечисления
        LightState(int code, String message) {
            this.code = code;
            this.message = message;
        }

        // Метод для получения кода состояния
        public int getCode() {
            return code;
        }

        // Метод для получения сообщения состояния
        public String getMessage() {
            return message;
        }
    }

    // Метод для демонстрации работы с перечислением
    public void showLightState(LightState state) {
        System.out.println("Light: " + state.name() +
                " (Code: " + state.getCode() +
                ", Message: " + state.getMessage() + ")");
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        // Перебор всех состояний светофора
        for (LightState state : LightState.values()) {
            trafficLight.showLightState(state);
        }
    }
}
