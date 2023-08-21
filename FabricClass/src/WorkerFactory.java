public class WorkerFactory {
        public Worker create(double... EXP) {
            if (EXP[0] > 500 && EXP[0] < 1500 && EXP[1] < 2) {
                return new Junior(EXP[0], EXP[1]);
            } else if (EXP[0] > 1500 && EXP[0] < 5000 && EXP[1] > 2 && EXP[1] < 5) {
                return new Middle(EXP[0], EXP[1]);
            } else if (EXP[0] > 5000 && EXP[1] > 5) {
                return new Senior(EXP[0], EXP[1]);
            } else {
                throw new IllegalArgumentException("can't create object with arguments " + EXP);
            }
        }
}
