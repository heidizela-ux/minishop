package com.tecsup.minishop.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ProductRequest(String name, Double price, Integer stock) {
}