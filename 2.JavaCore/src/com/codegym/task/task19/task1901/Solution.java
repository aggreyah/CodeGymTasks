package com.codegym.task.task19.task1901;

/* 
TableAdapter

*/

public class Solution {
    public static void main(String[] args) {
        ATable aTable = new ATable() {
            @Override
            public String getCurrentUserName() {
                return "Amigo";
            }

            @Override
            public String getTableName() {
                return "DashboardTable";
            }
        };

        BTable table = new TableAdapter(aTable);
        System.out.println(table.getHeaderText());
    }

    public static class TableAdapter implements BTable {

        private ATable aTable;

        TableAdapter(ATable table){
            this.aTable = table;
        }

        @Override
        public String getHeaderText() {
            return String.format("[%s] : %s", this.aTable.getCurrentUserName(), this.aTable.getTableName());
        }
    }

    public interface ATable {
        String getCurrentUserName();
        String getTableName();
    }

    public interface BTable {
        String getHeaderText();
    }
}