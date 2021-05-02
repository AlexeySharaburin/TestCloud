package ru.netology.test_cloud.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ClientData {

    private String filePath;

    private List<String> listFiles;

    private boolean removed;

}