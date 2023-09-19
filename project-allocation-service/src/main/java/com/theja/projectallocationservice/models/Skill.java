package com.theja.projectallocationservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Represents a skill possessed by users and required for openings.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skill {
    private Long id;                // Unique identifier for the skill
    private String title;           // Title or name of the skill
    @JsonIgnore
    private List<User> users;       // List of users possessing this skill
    @JsonIgnore
    private List<DBOpening> openings; // List of openings requiring this skill
}