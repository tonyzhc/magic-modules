/*
 * Copyright (c) HashiCorp, Inc.
 * SPDX-License-Identifier: MPL-2.0
 */

// This file is maintained in the GoogleCloudPlatform/magic-modules repository and copied into the downstream provider repositories. Any changes to this file in the downstream will be overwritten.

// Provider name that matches the name in the Registry
const val ProviderNameGa = "google"
const val ProviderNameBeta = "google-beta"

// specifies the default hour (UTC) at which tests should be triggered, if enabled
const val DefaultStartHour = 4

// specifies the default level of parallelism per-service-package
const val DefaultParallelism = 6

// specifies the default version of Terraform Core which should be used for testing
const val DefaultTerraformCoreVersion = "1.8.0-rc1" // TODO(SarahFrench) - update to 1.8.0 once it's gone GA

// This represents a cron view of days of the week
const val DefaultDaysOfWeek = "*"

// Cron value for any day of month
const val DefaultDaysOfMonth = "*"

// Value used to make long-running builds fail due to a timeout
const val DefaultBuildTimeoutDuration = 60 * 12 // 12 hours in minutes

// Values used to define and reference Shared Resource locks, used to avoid conflicting builds
const val SharedResourceNameGa = "ci-test-project-nightly-ga Service Lock"
const val SharedResourceNameBeta = "ci-test-project-nightly-beta Service Lock"
const val SharedResourceNameVcr = "ci-test-project-188019 Service Lock"

// Build configuration names referenced in multiple places
const val ServiceSweeperName = "Service Sweeper"
const val ProjectSweeperName = "Project Sweeper"
const val NightlyTestsProjectId = "NightlyTests"
const val MMUpstreamProjectId = "MMUpstreamTests"
const val VcrRecordingProjectId = "VCRRecording"
