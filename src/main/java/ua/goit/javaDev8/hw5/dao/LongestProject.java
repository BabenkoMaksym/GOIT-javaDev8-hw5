package ua.goit.javaDev8.hw5.dao;

public class LongestProject {
        Integer projectId;
        Integer projCost;

        public Integer getProjectId() {
                return projectId;
        }

        public void setProjectId(Integer projectId) {
                this.projectId = projectId;
        }

        public Integer getMonthCount() {
                return projCost;
        }

        public void setMonthCount(Integer monthCount) {
                this.projCost = monthCount;
        }

        @Override
        public String toString() {
                return "LongestProject{" +
                        "projectId=" + projectId +
                        ", monthCount=" + projCost +
                        '}';
        }
}
